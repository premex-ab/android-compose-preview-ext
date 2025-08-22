package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SaskTel device specifications for Android Compose previews.
 *
 * This extension provides SaskTel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sasktel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sasktel: Any
  get() = object {
      /** SaskTel HMB2213PW22WA */
      val HMB2213PW22WA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SaskTel uiw4054sas */
      val UIW4054SAS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
