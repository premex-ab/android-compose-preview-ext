package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * unnecto device specifications for Android Compose previews.
 *
 * This extension provides unnecto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unnecto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unnecto: Any
  get() = object {
      /** DeviceSpec(manufacturer=unnecto, code=Bolt1, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=unnecto, code=Bolt1, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val BOLT1 = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=unnecto, code=Bolt10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=unnecto, code=Bolt10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BOLT10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=unnecto, code=Bolt20, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=unnecto, code=Bolt20, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val BOLT20 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
