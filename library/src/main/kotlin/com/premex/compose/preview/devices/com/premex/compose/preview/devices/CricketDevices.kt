package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cricket device specifications for Android Compose previews.
 *
 * This extension provides Cricket device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cricket.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cricket: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cricket, code=EC211001, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=EC211001, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val EC211001 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=EC211002, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=EC211002, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val EC211002 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=EC211003, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=EC211003, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val EC211003 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=EC211004, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=EC211004, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val EC211004 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=SL100EA, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=SL100EA, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SL100EA = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cricket, code=SL101AE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=SL101AE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SL101AE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cricket, code=SL219C, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=SL219C, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val SL219C = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Cricket, code=SN304AE, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=SN304AE, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val SN304AE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cricket, code=SN509C, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=SN509C, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val SN509C = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Cricket, code=U304AC, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=U304AC, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val U304AC = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cricket, code=U325AC, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=U325AC, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val U325AC = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cricket, code=U380AC, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=U380AC, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val U380AC = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Cricket, code=U6080AC, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=U6080AC, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val U6080AC = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=U705AC, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=U705AC, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val U705AC = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Cricket, code=v350c, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=v350c, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V350C = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cricket, code=WTCKT01, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=WTCKT01, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val WTCKT01 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Cricket, code=ZON, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cricket, code=ZON, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val ZON = "spec:width=720,height=1640,unit=px,dpi=280"

  }
