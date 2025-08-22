package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHAINWAY device specifications for Android Compose previews.
 *
 * This extension provides CHAINWAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHAINWAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHAINWAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=CHAINWAY, code=C61P, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=C61P, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val C61P = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CHAINWAY, code=C66, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=C66, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C66 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHAINWAY, code=C71, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=C71, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C71 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CHAINWAY, code=C72, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=C72, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val C72 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CHAINWAY, code=MC50, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=MC50, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MC50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHAINWAY, code=MC62, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=MC62, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MC62 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CHAINWAY, code=MC95, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=MC95, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MC95 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHAINWAY, code=P80, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=P80, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P80 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CHAINWAY, code=P80_PRO, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CHAINWAY, code=P80_PRO, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val P80_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
