package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KrossElegance device specifications for Android Compose previews.
 *
 * This extension provides KrossElegance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Krosselegance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Krosselegance: Any
  get() = object {
      /** KrossElegance KE-TB1032OF */
      val KE_TB1032OF = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** KrossElegance KE-TB816OF */
      val KE_TB816OF = "spec:width=800,height=1280,unit=px,dpi=213"

  }
