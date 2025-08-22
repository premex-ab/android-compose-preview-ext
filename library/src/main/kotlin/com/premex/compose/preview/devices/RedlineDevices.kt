package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REDLINE device specifications for Android Compose previews.
 *
 * This extension provides REDLINE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redline: Any
  get() = object {
      /** REDLINE Space_A10 */
      val SPACE_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** REDLINE Space_A8 */
      val SPACE_A8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** REDLINE Space_M10 */
      val SPACE_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** REDLINE Space_M10Pro */
      val SPACE_M10PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
