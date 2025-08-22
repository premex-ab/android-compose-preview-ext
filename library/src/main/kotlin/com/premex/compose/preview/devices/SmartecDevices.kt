package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smartec device specifications for Android Compose previews.
 *
 * This extension provides Smartec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smartec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smartec: Any
  get() = object {
      /** Smartec Atractivo */
      val ATRACTIVO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Smartec SmartabS32 */
      val SMARTABS32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Smartec SmartabX8 */
      val SMARTABX8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
