package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MetroPCS device specifications for Android Compose previews.
 *
 * This extension provides MetroPCS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MetroPCS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MetroPCS: Any
  get() = object {
      /** DeviceSpec(manufacturer=MetroPCS, code=c50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=c50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MetroPCS, code=e2nam, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=e2nam, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E2NAM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MetroPCS, code=g4stylusn, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=g4stylusn,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val G4STYLUSN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MetroPCS, code=hwY301A1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=hwY301A1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val HWY301A1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MetroPCS, code=lv3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=lv3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MetroPCS, code=lv517, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=lv517, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LV517 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MetroPCS, code=m1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=m1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MetroPCS, code=m209n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=m209n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M209N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MetroPCS, code=ph2n, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=ph2n, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PH2N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MetroPCS, code=sf340n, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=sf340n, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SF340N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=MetroPCS, code=w5, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MetroPCS, code=w5, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W5 = "spec:width=480,height=800,unit=px,dpi=240"

  }
