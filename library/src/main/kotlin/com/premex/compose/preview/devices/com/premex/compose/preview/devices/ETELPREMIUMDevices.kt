package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ETELPREMIUM device specifications for Android Compose previews.
 *
 * This extension provides ETELPREMIUM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETELPREMIUM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETELPREMIUM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ETELPREMIUM, code=E26, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETELPREMIUM, code=E26, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val E26 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ETELPREMIUM, code=E65, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETELPREMIUM, code=E65, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val E65 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ETELPREMIUM, code=NOTE_25_ULTRA, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ETELPREMIUM, code=NOTE_25_ULTRA,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_25_ULTRA = "spec:width=720,height=1640,unit=px,dpi=320"

  }
