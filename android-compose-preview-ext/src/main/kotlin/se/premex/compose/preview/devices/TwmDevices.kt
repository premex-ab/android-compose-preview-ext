package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TWM device specifications for Android Compose previews.
 *
 * This extension provides TWM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Twm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Twm: Any
  get() = object {
      /** TWM Amazing_X3s */
      val AMAZING_X3S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TWM P839V56 */
      val P839V56 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
