package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * iVOOMi device specifications for Android Compose previews.
 *
 * This extension provides iVOOMi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ivoomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ivoomi: Any
  get() = object {
      /** iVOOMi i2 */
      val I2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
