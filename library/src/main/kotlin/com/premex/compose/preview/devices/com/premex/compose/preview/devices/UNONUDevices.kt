package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNONU device specifications for Android Compose previews.
 *
 * This extension provides UNONU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNONU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNONU: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNONU, code=N63A, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=N63A, width=720,
      height=1520, dpi=300, isGoogleDevice=false).code */
      val N63A = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=UNONU, code=UN55L, width=444, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UN55L, width=444,
      height=960, dpi=213, isGoogleDevice=false).code */
      val UN55L = "spec:width=444,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_N55S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_N55S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val UNONU_N55S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_N65_LITE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_N65_LITE,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UNONU_N65_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_U4001, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_U4001, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val UNONU_U4001 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_W50X, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_W50X, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val UNONU_W50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_W57A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_W57A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val UNONU_W57A = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_W609, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_W609, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val UNONU_W609 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UNONU, code=UNONU_W61, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UNONU_W61, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val UNONU_W61 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UNONU, code=UT3G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UT3G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val UT3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=UNONU, code=UT3GPlus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=UT3GPlus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val UT3GPLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNONU, code=W50A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNONU, code=W50A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val W50A = "spec:width=480,height=854,unit=px,dpi=240"

  }
