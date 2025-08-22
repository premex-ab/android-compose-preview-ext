package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iData device specifications for Android Compose previews.
 *
 * This extension provides iData device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IData.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IData: Any
  get() = object {
      /** DeviceSpec(manufacturer=iData, code=i3, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=i3, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val I3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=iData_50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IDATA_50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iData, code=iData_K1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_K1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IDATA_K1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=iData_K1_EEA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_K1_EEA,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val IDATA_K1_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=iData_P1_mini, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_P1_mini,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val IDATA_P1_MINI = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=iData, code=iData_T1_UHF, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_T1_UHF,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val IDATA_T1_UHF = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iData, code=iData_T2, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=iData_T2, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val IDATA_T2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iData, code=K3Pro, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=K3Pro, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K3PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=K3S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=K3S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K3S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=K8, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=K8, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val K8 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iData, code=T1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=T1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iData, code=T1Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=T1Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T1PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=iData, code=T3_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iData, code=T3_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
