package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * INFINIX device specifications for Android Compose previews.
 *
 * This extension provides INFINIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Infinix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Infinix: Any
  get() = object {
      /** INFINIX INFINIX-X551 */
      val INFINIX_X551 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INFINIX INFINIX-X553 */
      val INFINIX_X553 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INFINIX INFINIX-X553-A1 */
      val INFINIX_X553_A1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** INFINIX INFINIX-X554 */
      val INFINIX_X554 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
