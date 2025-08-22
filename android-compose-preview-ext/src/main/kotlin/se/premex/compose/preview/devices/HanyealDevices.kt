package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HANYEAL device specifications for Android Compose previews.
 *
 * This extension provides HANYEAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hanyeal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hanyeal: Any
  get() = object {
      /** HANYEAL E101GC */
      val E101GC = "spec:width=800,height=1280,unit=px,dpi=160"

  }
