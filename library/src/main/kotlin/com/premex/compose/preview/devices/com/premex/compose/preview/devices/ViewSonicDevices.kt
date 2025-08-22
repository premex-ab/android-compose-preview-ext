package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ViewSonic device specifications for Android Compose previews.
 *
 * This extension provides ViewSonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ViewSonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ViewSonic: Any
  get() = object {
      /** DeviceSpec(manufacturer=ViewSonic, code=IFP34, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=IFP34, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val IFP34 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ViewSonic, code=IFP51, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=IFP51, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val IFP51 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ViewSonic, code=IFP8652-2, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=IFP8652-2,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val IFP8652_2 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ViewSonic, code=IN02_series, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=IN02_series,
      width=2160, height=3840, dpi=420, isGoogleDevice=false).code */
      val IN02_SERIES = "spec:width=2160,height=3840,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=ViewSonic, code=mid1016_ma, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=mid1016_ma,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1016_MA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ViewSonic, code=mid1032_mk, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=mid1032_mk,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ViewSonic, code=mid7015_mk_32, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=mid7015_mk_32,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ViewSonic, code=VPC-A31-O1, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=VPC-A31-O1,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val VPC_A31_O1 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ViewSonic, code=VSD242, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ViewSonic, code=VSD242, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val VSD242 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
