package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * InFocus device specifications for Android Compose previews.
 *
 * This extension provides InFocus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.InFocus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.InFocus: Any
  get() = object {
      /** DeviceSpec(manufacturer=InFocus, code=A02, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=A02, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A02 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=A08, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=A08, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A08 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AA2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AA2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AA2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AB2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AB2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AB2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AB5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AB5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AB5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AG2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AG2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AG2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AG5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AG5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AG5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AH2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AH2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AH2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AU8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AU8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AU8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=AY2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=AY2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AY2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=D77, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=D77, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=FAT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=FAT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=FOT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=FOT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FOT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=G10, width=768, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=G10, width=768,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G10 = "spec:width=768,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=G40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=G40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=G42, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=G42, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G42 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=InFocus, code=HGO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=HGO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val HGO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=InFocus, code=IF195a, width=900, height=1600, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=IF195a, width=900,
      height=1600, dpi=160, isGoogleDevice=false).code */
      val IF195A = "spec:width=900,height=1600,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=InFocus, code=IF236a, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=IF236a, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val IF236A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=InFocus, code=VN2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=VN2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VN2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=InFocus, code=VNA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=VNA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VNA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=InFocus, code=VZH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=VZH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VZH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=InFocus, code=ZD1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=ZD1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZD1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=InFocus, code=ZM1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=InFocus, code=ZM1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZM1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
