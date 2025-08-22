package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FCNT device specifications for Android Compose previews.
 *
 * This extension provides FCNT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FCNT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FCNT: Any
  get() = object {
      /** DeviceSpec(manufacturer=FCNT, code=A101FC, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=A101FC, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A101FC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=A401FC, width=720, height=1560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=A401FC, width=720,
      height=1560, dpi=360, isGoogleDevice=false).code */
      val A401FC = "spec:width=720,height=1560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=FCNT, code=A402FC, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=A402FC, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A402FC = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=BZ02, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=BZ02, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val BZ02 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=BZ03, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=BZ03, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val BZ03 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=F41B, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F41B, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val F41B = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=F51B, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F51B, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val F51B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=F51C, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F51C, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val F51C = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=FCNT, code=F51E, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F51E, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val F51E = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=FCNT, code=F52B, width=1080, height=1980, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F52B, width=1080,
      height=1980, dpi=480, isGoogleDevice=false).code */
      val F52B = "spec:width=1080,height=1980,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FCNT, code=F52E, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F52E, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val F52E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=F53E, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F53E, width=1080,
      height=2160, dpi=400, isGoogleDevice=false).code */
      val F53E = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=FCNT, code=FCG01, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=FCG01, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val FCG01 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=FCG02, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=FCG02, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val FCG02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=fuji, width=1200, height=2670, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=fuji, width=1200,
      height=2670, dpi=450, isGoogleDevice=false).code */
      val FUJI = "spec:width=1200,height=2670,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=FCNT, code=F-51F, width=1200, height=2670, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=F-51F, width=1200,
      height=2670, dpi=450, isGoogleDevice=false).code */
      val F_51F = "spec:width=1200,height=2670,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=FCNT, code=M06, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=M06, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val M06 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=FCNT, code=M07, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=M07, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M07 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FCNT, code=MR01, width=720, height=1560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCNT, code=MR01, width=720,
      height=1560, dpi=360, isGoogleDevice=false).code */
      val MR01 = "spec:width=720,height=1560,unit=px,dpi=360"

  }
