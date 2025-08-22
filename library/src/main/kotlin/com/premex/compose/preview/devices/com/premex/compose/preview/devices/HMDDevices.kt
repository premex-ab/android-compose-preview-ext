package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HMD device specifications for Android Compose previews.
 *
 * This extension provides HMD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HMD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HMD: Any
  get() = object {
      /** DeviceSpec(manufacturer=HMD, code=AGTAH, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=AGTAH, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val AGTAH = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=AGTH, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=AGTH, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val AGTH = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=ARP, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=ARP, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val ARP = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=HMD, code=ARW, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=ARW, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val ARW = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=HMD, code=CMT, width=576, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=CMT, width=576,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CMT = "spec:width=576,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HMD, code=LGD, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=LGD, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val LGD = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=LGP, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=LGP, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val LGP = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=LGR, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=LGR, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val LGR = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=NHK, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=NHK, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val NHK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=NYX, width=576, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=NYX, width=576,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NYX = "spec:width=576,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=HMD, code=RCK, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=RCK, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val RCK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=SHK, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=SHK, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SHK = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=HMD, code=SNT, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=SNT, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val SNT = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=HMD, code=TCT, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HMD, code=TCT, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val TCT = "spec:width=1080,height=2400,unit=px,dpi=400"

  }
