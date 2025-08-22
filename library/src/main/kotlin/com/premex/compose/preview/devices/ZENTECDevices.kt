package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZENTEC device specifications for Android Compose previews.
 *
 * This extension provides ZENTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZENTEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZENTEC: Any
  get() = object {
      /** ZENTEC ALTAB08 */
      val ALTAB08 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
