package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * unnecto device specifications for Android Compose previews.
 *
 * This extension provides unnecto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unnecto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unnecto: Any
  get() = object {
      /** unnecto Bolt1 */
      val BOLT1 = "spec:width=480,height=854,unit=px,dpi=180"

      /** unnecto Bolt10 */
      val BOLT10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** unnecto Bolt20 */
      val BOLT20 = "spec:width=720,height=1600,unit=px,dpi=480"

  }
