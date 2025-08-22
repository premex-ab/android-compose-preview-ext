package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KAZAM device specifications for Android Compose previews.
 *
 * This extension provides KAZAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kazam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kazam: Any
  get() = object {
      /** KAZAM KAZAM */
      val KAZAM = "spec:width=480,height=854,unit=px,dpi=240"

      /** KAZAM Tornado_348 */
      val TORNADO_348 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KAZAM TR6L5035 */
      val TR6L5035 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
