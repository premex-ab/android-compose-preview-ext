package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAHL device specifications for Android Compose previews.
 *
 * This extension provides DAHL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAHL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAHL: Any
  get() = object {
      /** DeviceSpec(manufacturer=DAHL, code=People_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DAHL, code=People_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PEOPLE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
