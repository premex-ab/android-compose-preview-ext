package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

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
      /** Athesi_Professional AP5705S */
      val AP5705S = "spec:width=720,height=1440,unit=px,dpi=320"

  }
