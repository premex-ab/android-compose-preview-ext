package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YELLYOUTH device specifications for Android Compose previews.
 *
 * This extension provides YELLYOUTH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YELLYOUTH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YELLYOUTH: Any
  get() = object {
      /** YELLYOUTH TAB_101 */
      val TAB_101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
