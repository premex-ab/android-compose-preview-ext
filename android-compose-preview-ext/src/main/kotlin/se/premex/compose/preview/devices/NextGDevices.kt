package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NEXT-G device specifications for Android Compose previews.
 *
 * This extension provides NEXT-G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NextG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NextG: Any
  get() = object {
      /** NEXT-G stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NEXT-G zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
