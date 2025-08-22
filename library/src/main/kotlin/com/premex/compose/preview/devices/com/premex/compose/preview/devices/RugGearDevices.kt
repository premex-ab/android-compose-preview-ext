package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RugGear device specifications for Android Compose previews.
 *
 * This extension provides RugGear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RugGear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RugGear: Any
  get() = object {
      /** DeviceSpec(manufacturer=RugGear, code=PSM01E, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=PSM01E, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val PSM01E = "spec:width=640,height=1136,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG540, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG540, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val RG540 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RugGear, code=RG650, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG650, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RG650 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG655, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG655, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RG655 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG725, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG725, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val RG725 = "spec:width=640,height=1136,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG750_EEA, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG750_EEA, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val RG750_EEA = "spec:width=640,height=1136,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG750_ROW, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG750_ROW, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val RG750_ROW = "spec:width=640,height=1136,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG850, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG850, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RG850 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG880, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG880, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val RG880 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG910, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG910, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RG910 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG930i, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG930i, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RG930I = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RugGear, code=RG935, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RugGear, code=RG935, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val RG935 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
