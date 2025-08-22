package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TelusCorporation device specifications for Android Compose previews.
 *
 * This extension provides TelusCorporation device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TelusCorporation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TelusCorporation: Any
  get() = object {
      /** DeviceSpec(manufacturer=TelusCorporation, code=HMB2213PW22TS, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TelusCorporation,
      code=HMB2213PW22TS, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HMB2213PW22TS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
