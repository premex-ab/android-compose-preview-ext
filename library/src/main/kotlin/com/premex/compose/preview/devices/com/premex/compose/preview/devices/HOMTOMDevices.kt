package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOMTOM device specifications for Android Compose previews.
 *
 * This extension provides HOMTOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOMTOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOMTOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOMTOM, code=C1, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=C1, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C1 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=C2, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=C2, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C2 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=H10, width=720, height=1512, dpi=272,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=H10, width=720,
      height=1512, dpi=272, isGoogleDevice=false).code */
      val H10 = "spec:width=720,height=1512,unit=px,dpi=272"

      /** DeviceSpec(manufacturer=HOMTOM, code=H5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=H5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val H5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=HT70, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=HT70, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HT70 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=HT80, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=HT80, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HT80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=P30_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=P30_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=S16, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=S16, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val S16 = "spec:width=640,height=1136,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=S99, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=S99, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S99 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HOMTOM, code=Z11, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOMTOM, code=Z11, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z11 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
