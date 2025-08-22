package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Rombica device specifications for Android Compose previews.
 *
 * This extension provides Rombica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rombica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rombica: Any
  get() = object {
      /** Rombica myPhone_Jet */
      val MYPHONE_JET = "spec:width=480,height=854,unit=px,dpi=200"

  }
