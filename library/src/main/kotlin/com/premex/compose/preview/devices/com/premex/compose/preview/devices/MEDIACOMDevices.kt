package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEDIACOM device specifications for Android Compose previews.
 *
 * This extension provides MEDIACOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEDIACOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEDIACOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=MEDIACOM, code=AZIMUT_4, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=AZIMUT_4,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val AZIMUT_4 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP10KID, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP10KID,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP10KID = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ2TW, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ2TW,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val M_SP1AZ2TW = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val M_SP1AZ3 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3L,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP1AZ3L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3L2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3L2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP1AZ3L2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3P, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1AZ3P,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val M_SP1AZ3P = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1EY_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1EY_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP1EY_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP1X10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP1X10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP1X10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP8DY_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP8DY_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP8DY_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP8EY, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP8EY, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP8EY = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP8GY, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP8GY, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M_SP8GY = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MEDIACOM, code=M-SP8KID, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=M-SP8KID, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M_SP8KID = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=SP1AZ4_L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=SP1AZ4_L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SP1AZ4_L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MEDIACOM, code=SP1AZ4_P, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEDIACOM, code=SP1AZ4_P,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val SP1AZ4_P = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
