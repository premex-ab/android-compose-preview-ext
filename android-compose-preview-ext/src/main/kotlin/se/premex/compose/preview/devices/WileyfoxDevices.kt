package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Wileyfox device specifications for Android Compose previews.
 *
 * This extension provides Wileyfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wileyfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wileyfox: Any
  get() = object {
      /** Wileyfox crackling */
      val CRACKLING = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Wileyfox marmite */
      val MARMITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Wileyfox porridge */
      val PORRIDGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Wileyfox porridgek3 */
      val PORRIDGEK3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
