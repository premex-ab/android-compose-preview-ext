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
 * @Preview(device = Devices.LAUNCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAUNCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAUNCH, code=Diagnostic_Tablet, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAUNCH, code=Diagnostic_Tablet,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val DIAGNOSTIC_TABLET = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAUNCH, code=Diagnostic_Tool, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAUNCH, code=Diagnostic_Tool,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val DIAGNOSTIC_TOOL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAUNCH, code=X-431PADVII, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAUNCH, code=X-431PADVII,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val X_431PADVII = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
