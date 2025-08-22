package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Athesi_Professional device specifications for Android Compose previews.
 *
 * This extension provides Athesi_Professional device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AthesiProfessional.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AthesiProfessional: Any
  get() = object {
      /** DeviceSpec(manufacturer=Athesi_Professional, code=AP5705S, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Athesi_Professional,
      code=AP5705S, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val AP5705S = "spec:width=720,height=1440,unit=px,dpi=320"

  }
