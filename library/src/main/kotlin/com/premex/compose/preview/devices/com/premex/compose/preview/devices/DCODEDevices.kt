package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DCODE device specifications for Android Compose previews.
 *
 * This extension provides DCODE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DCODE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DCODE: Any
  get() = object {
      /** DeviceSpec(manufacturer=DCODE, code=DS_BD1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_BD1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DS_BD1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_BD2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_BD2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DS_BD2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DS_CL1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL2_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL2_Lite, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DS_CL2_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL2_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL2_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DS_CL2_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL4, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL4, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val DS_CL4 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL4_Lite, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL4_Lite, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DS_CL4_LITE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DCODE, code=DS_CL4_Pro, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS_CL4_Pro, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val DS_CL4_PRO = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DCODE, code=DS-X1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCODE, code=DS-X1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val DS_X1 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
