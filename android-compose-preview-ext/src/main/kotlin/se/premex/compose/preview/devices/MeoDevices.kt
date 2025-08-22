package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MEO device specifications for Android Compose previews.
 *
 * This extension provides MEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meo: Any
  get() = object {
      /** MEO DIW377-MEO */
      val DIW377_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MEO DIW3930-MEO */
      val DIW3930_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MEO DV8555-MEO */
      val DV8555_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MEO DV8985-MEO */
      val DV8985_MEO = "spec:width=576,height=720,unit=px,dpi=320"

  }
