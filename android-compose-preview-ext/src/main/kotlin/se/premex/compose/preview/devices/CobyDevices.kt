package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COBY device specifications for Android Compose previews.
 *
 * This extension provides COBY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coby: Any
  get() = object {
      /** COBY MID7052 */
      val MID7052 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** COBY MID8072 */
      val MID8072 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
