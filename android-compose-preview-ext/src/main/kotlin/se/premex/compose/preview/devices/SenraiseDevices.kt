package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SENRAISE device specifications for Android Compose previews.
 *
 * This extension provides SENRAISE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Senraise.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Senraise: Any
  get() = object {
      /** SENRAISE H10 */
      val H10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
