package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lava device specifications for Android Compose previews.
 *
 * This extension provides Lava device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lava.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lava: Any
  get() = object {
      /** DeviceSpec(manufacturer=Lava, code=A52, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=A52, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A52 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=A76Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=A76Plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A76PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=A77, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=A77, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A77 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=A97, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=A97, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A97 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=A97_2GB_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=A97_2GB_PLUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A97_2GB_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=Be_U, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Be_U, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BE_U = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=iris30, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris30, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val IRIS30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=iris40, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris40, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS40 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=iris50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=iris702, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris702, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS702 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=iris820, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris820, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS820 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=iris821, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris821, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS821 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=iris870, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=iris870, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS870 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=LA79, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LA79, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LA79 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=LAVA_A3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LAVA_A3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LAVA_A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Lava_Aura_Plus, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Lava_Aura_Plus,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val LAVA_AURA_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Lava, code=LAVA_R1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LAVA_R1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LAVA_R1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=LAVA_Z10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LAVA_Z10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LAVA_Z10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=LE000Z93P, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LE000Z93P, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LE000Z93P = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LMG01, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LMG01, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LMG01 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LMG02, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LMG02, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LMG02 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LMX02, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LMX02, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LMX02 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LMX04, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LMX04, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LMX04 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LMX06, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LMX06, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LMX06 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LZG01, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LZG01, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val LZG01 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lava, code=LZG401, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=LZG401, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG401 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=P7, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=P7, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P7 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=V23GB, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=V23GB, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V23GB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=X10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=X10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=X41_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=X41_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X41_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=X50_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=X50_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X50_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=X81, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=X81, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X81 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z100, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z100, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z100 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z25, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z25, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z25 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val Z40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lava, code=Z61P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z61P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z61P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z66, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z66, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z66 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lava, code=Z93P, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lava, code=Z93P, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z93P = "spec:width=720,height=1560,unit=px,dpi=320"

  }
