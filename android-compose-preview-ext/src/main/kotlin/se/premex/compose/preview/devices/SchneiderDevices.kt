package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SCHNEIDER device specifications for Android Compose previews.
 *
 * This extension provides SCHNEIDER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Schneider.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Schneider: Any
  get() = object {
      /** SCHNEIDER bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SCHNEIDER barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SCHNEIDER beaudry */
      val BEAUDRY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SCHNEIDER komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SCHNEIDER R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SCHNEIDER R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
