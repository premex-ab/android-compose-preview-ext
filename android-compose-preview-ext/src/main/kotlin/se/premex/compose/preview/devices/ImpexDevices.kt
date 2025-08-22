package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Impex device specifications for Android Compose previews.
 *
 * This extension provides Impex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Impex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Impex: Any
  get() = object {
      /** Impex marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Impex nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
