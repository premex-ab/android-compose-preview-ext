package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F-Plus device specifications for Android Compose previews.
 *
 * This extension provides F-Plus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FPlus: Any
  get() = object {
      /** DeviceSpec(manufacturer=F-Plus, code=R570E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=R570E, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R570E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F-Plus, code=SA50_21620, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=SA50_21620, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val SA50_21620 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=F-Plus, code=SA55_21624, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=SA55_21624, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SA55_21624 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=F-Plus, code=SH60_23230, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=SH60_23230, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val SH60_23230 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=F-Plus, code=SH65_23248, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=SH65_23248, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SH65_23248 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F-Plus, code=SP65_66440, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=SP65_66440, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SP65_66440 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F-Plus, code=T1100, width=1600, height=2176, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F-Plus, code=T1100, width=1600,
      height=2176, dpi=320, isGoogleDevice=false).code */
      val T1100 = "spec:width=1600,height=2176,unit=px,dpi=320"

  }
