package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARTRAN device specifications for Android Compose previews.
 *
 * This extension provides ARTRAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARTRAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARTRAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARTRAN, code=ARTRAN_EI101F, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARTRAN, code=ARTRAN_EI101F,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ARTRAN_EI101F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ARTRAN, code=AZ101F, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARTRAN, code=AZ101F, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val AZ101F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ARTRAN, code=IB101F_Pro, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARTRAN, code=IB101F_Pro,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val IB101F_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ARTRAN, code=IB868H, width=800, height=1340, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARTRAN, code=IB868H, width=800,
      height=1340, dpi=180, isGoogleDevice=false).code */
      val IB868H = "spec:width=800,height=1340,unit=px,dpi=180"

  }
