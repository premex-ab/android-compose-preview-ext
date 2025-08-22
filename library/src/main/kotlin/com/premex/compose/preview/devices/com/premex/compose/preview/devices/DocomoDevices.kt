package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * docomo device specifications for Android Compose previews.
 *
 * This extension provides docomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Docomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Docomo: Any
  get() = object {
      /** DeviceSpec(manufacturer=docomo, code=P-01K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=P-01K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P_01K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=P-02E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=P-02E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P_02E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=P-03E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=P-03E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P_03E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01E, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01E, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SO_01E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-01F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_01J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01K, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01K, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-01L, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01L, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val SO_01L = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=docomo, code=SO-01M, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-01M, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_01M = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-02E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_02E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-02F, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02F, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_02F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-02G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_02G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-02H, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02H, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_02H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-02J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_02J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-02K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_02K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-02L, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-02L, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SO_02L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03E, width=1128, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03E, width=1128,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SO_03E = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=docomo, code=SO-03F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_03F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_03G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_03H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_03J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03K, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03K, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SO_03K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-03L, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-03L, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SO_03L = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-04D, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04D, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SO_04D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-04E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_04E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-04F, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04F, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_04F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-04G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SO_04G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-04H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_04H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-04J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SO_04J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-04K, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-04K, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val SO_04K = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-05D, width=540, height=888, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-05D, width=540,
      height=888, dpi=240, isGoogleDevice=false).code */
      val SO_05D = "spec:width=540,height=888,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=docomo, code=SO-05F, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-05F, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SO_05F = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=docomo, code=SO-05G, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-05G, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val SO_05G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=docomo, code=SO-05K, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-05K, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SO_05K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=docomo, code=SO-41A, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-41A, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_41A = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-41B, width=720, height=1496, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-41B, width=720,
      height=1496, dpi=300, isGoogleDevice=false).code */
      val SO_41B = "spec:width=720,height=1496,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=docomo, code=SO-51A, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51A, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SO_51A = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-51B, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51B, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SO_51B = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-51C, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51C, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SO_51C = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-51D, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51D, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SO_51D = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-51E, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51E, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val SO_51E = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=docomo, code=SO-51F, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-51F, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val SO_51F = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=docomo, code=SO-52A, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-52A, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_52A = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-52B, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-52B, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_52B = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-52C, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-52C, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_52C = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-52D, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-52D, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SO_52D = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=docomo, code=SO-52E, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-52E, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SO_52E = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=docomo, code=SO-53B, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-53B, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SO_53B = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=docomo, code=SO-53C, width=720, height=1496, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-53C, width=720,
      height=1496, dpi=300, isGoogleDevice=false).code */
      val SO_53C = "spec:width=720,height=1496,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=docomo, code=SO-53D, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-53D, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SO_53D = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=docomo, code=SO-54C, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=docomo, code=SO-54C, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SO_54C = "spec:width=1080,height=2520,unit=px,dpi=450"

  }
