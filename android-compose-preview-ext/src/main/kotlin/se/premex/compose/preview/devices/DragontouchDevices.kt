package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DragonTouch device specifications for Android Compose previews.
 *
 * This extension provides DragonTouch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dragontouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dragontouch: Any
  get() = object {
      /** DragonTouch MAX-10 */
      val MAX_10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DragonTouch tulip-d210 */
      val TULIP_D210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DragonTouch V10 */
      val V10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
