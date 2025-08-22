package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOME device specifications for Android Compose previews.
 *
 * This extension provides GOME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOME: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOME, code=GOME_C7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOME, code=GOME_C7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GOME_C7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GOME, code=GOME_C7_Note, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOME, code=GOME_C7_Note, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GOME_C7_NOTE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GOME, code=GOME_C7_Note_Mini, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOME, code=GOME_C7_Note_Mini,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val GOME_C7_NOTE_MINI = "spec:width=720,height=1440,unit=px,dpi=320"

  }
