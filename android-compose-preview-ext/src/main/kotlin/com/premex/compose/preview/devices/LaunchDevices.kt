package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAUNCH device specifications for Android Compose previews.
 *
 * This extension provides LAUNCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Launch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Launch: Any
  get() = object {
      /** LAUNCH Diagnostic_Tablet */
      val DIAGNOSTIC_TABLET = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** LAUNCH Diagnostic_Tool */
      val DIAGNOSTIC_TOOL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** LAUNCH X-431PADVII */
      val X_431PADVII = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
