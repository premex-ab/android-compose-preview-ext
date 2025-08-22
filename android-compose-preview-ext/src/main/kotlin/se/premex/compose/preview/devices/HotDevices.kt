package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOT device specifications for Android Compose previews.
 *
 * This extension provides HOT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hot: Any
  get() = object {
      /** HOT DIW252_ALT_ME */
      val DIW252_ALT_ME = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** HOT DIW377_ALT_ME */
      val DIW377_ALT_ME = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HOT DV8555-KIH */
      val DV8555_KIH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HOT VSB3918_ALT_ME */
      val VSB3918_ALT_ME = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
