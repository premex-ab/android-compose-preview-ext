package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STG-Telecom device specifications for Android Compose previews.
 *
 * This extension provides STG-Telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StgTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StgTelecom: Any
  get() = object {
      /** STG-Telecom STG-KeyTab */
      val STG_KEYTAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
