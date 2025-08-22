package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YesTeL device specifications for Android Compose previews.
 *
 * This extension provides YesTeL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yestel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yestel: Any
  get() = object {
      /** YesTeL Note_30_pro */
      val NOTE_30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

  }
