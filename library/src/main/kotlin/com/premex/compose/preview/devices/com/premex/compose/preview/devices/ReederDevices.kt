package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Reeder device specifications for Android Compose previews.
 *
 * This extension provides Reeder device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reeder.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reeder: Any
  get() = object {
      /** DeviceSpec(manufacturer=Reeder, code=A8i-Q2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=A8i-Q2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A8I_Q2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Reeder, code=P10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=P10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=P10S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=P10S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P10S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Reeder, code=P13_Blue_Max_PL, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=P13_Blue_Max_PL,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val P13_BLUE_MAX_PL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=S19_Max_2_128GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=S19_Max_2_128GB,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val S19_MAX_2_128GB = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=S19_Max_32GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=S19_Max_32GB,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val S19_MAX_32GB = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=S19_Max_64GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=S19_Max_64GB,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val S19_MAX_64GB = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=S19_Max_Pro_S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=S19_Max_Pro_S,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val S19_MAX_PRO_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reeder, code=S919, width=1200, height=2664, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeder, code=S919, width=1200,
      height=2664, dpi=480, isGoogleDevice=false).code */
      val S919 = "spec:width=1200,height=2664,unit=px,dpi=480"

  }
