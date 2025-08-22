package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LIFEPHONE device specifications for Android Compose previews.
 *
 * This extension provides LIFEPHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lifephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lifephone: Any
  get() = object {
      /** LIFEPHONE LIFEPHONE_HERO */
      val LIFEPHONE_HERO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LIFEPHONE LIFEPHONE_IDOL */
      val LIFEPHONE_IDOL = "spec:width=720,height=1600,unit=px,dpi=480"

      /** LIFEPHONE LIFEPHONE_STAR */
      val LIFEPHONE_STAR = "spec:width=720,height=1600,unit=px,dpi=480"

      /** LIFEPHONE LIFEPHONE_VISION */
      val LIFEPHONE_VISION = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
