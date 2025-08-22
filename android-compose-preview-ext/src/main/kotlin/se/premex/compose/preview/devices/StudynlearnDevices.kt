package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STUDYNLEARN device specifications for Android Compose previews.
 *
 * This extension provides STUDYNLEARN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Studynlearn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Studynlearn: Any
  get() = object {
      /** STUDYNLEARN mensa_an64 */
      val MENSA_AN64 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
