package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * 1u1 device specifications for Android Compose previews.
 *
 * This extension provides 1u1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._1u1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._1u1: Any
  get() = object {
      /** 1u1 diw362_1u1 */
      val DIW362_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** 1u1 DIW377-1u1 */
      val DIW377_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** 1u1 diw387_1u1 */
      val DIW387_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
