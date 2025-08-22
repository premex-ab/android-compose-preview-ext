package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNITEL device specifications for Android Compose previews.
 *
 * This extension provides UNITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unitel: Any
  get() = object {
      /** UNITEL UNITEL_TAB_4G_H101 */
      val UNITEL_TAB_4G_H101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
